package new_1;

import java.util.Scanner;

public class TestPhongHoc {
    public static void main(String[] args) {
        DanhSachPhongHoc ds = new DanhSachPhongHoc();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm phòng");
            System.out.println("2. In danh sách");
            System.out.println("3. Tìm phòng theo mã");
            System.out.println("4. Danh sách phòng đạt chuẩn");
            System.out.println("5. Sắp xếp theo dãy nhà");
            System.out.println("6. Sắp xếp theo diện tích giảm dần");
            System.out.println("7. Sắp xếp theo số bóng đèn tăng dần");
            System.out.println("8. Cập nhật số máy tính");
            System.out.println("9. Xóa phòng");
            System.out.println("10. Tổng số phòng");
            System.out.println("11. Phòng máy có 60 máy");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (chon) {
                case 1:
                    // Tùy chọn thêm phòng (lý thuyết, máy tính, thí nghiệm)
                    System.out.print("Chọn loại phòng (1: LT, 2: MT, 3: TN): ");
                    int loai = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Mã phòng: ");
                    String ma = sc.nextLine();
                    System.out.print("Dãy nhà: ");
                    String day = sc.nextLine();
                    System.out.print("Diện tích: ");
                    double dt = sc.nextDouble();
                    System.out.print("Số bóng đèn: ");
                    int sb = sc.nextInt();

                    if (loai == 1) {
                        System.out.print("Có máy chiếu? (true/false): ");
                        boolean mayChieu = sc.nextBoolean();
                        ds.them(new PhongLyThuyet(ma, day, dt, sb, mayChieu));
                    } else if (loai == 2) {
                        System.out.print("Số máy tính: ");
                        int smt = sc.nextInt();
                        ds.them(new PhongMayTinh(ma, day, dt, sb, smt));
                    } else if (loai == 3) {
                        sc.nextLine();
                        System.out.print("Chuyên ngành: ");
                        String cn = sc.nextLine();
                        System.out.print("Sức chứa: ");
                        int scn = sc.nextInt();
                        System.out.print("Có bồn rửa? (true/false): ");
                        boolean bonRua = sc.nextBoolean();
                        ds.them(new PhongThiNghiem(ma, day, dt, sb, cn, scn, bonRua));
                    }
                    break;
                case 2:
                    System.out.println(ds);
                    break;
                case 3:
                    System.out.print("Nhập mã phòng: ");
                    String timMa = sc.nextLine();
                    System.out.println(ds.timKiem(timMa));
                    break;
                case 4:
                    for (PhongHoc p : ds.getDanhSachDatChuan())
                        System.out.println(p);
                    break;
                case 5:
                    ds.sapXepTheoDayNha();
                    System.out.println("Đã sắp xếp theo dãy nhà.");
                    break;
                case 6:
                    ds.sapXepTheoDienTichGiamDan();
                    System.out.println("Đã sắp xếp theo diện tích.");
                    break;
                case 7:
                    ds.sapXepTheoSoBongDenTangDan();
                    System.out.println("Đã sắp xếp theo số bóng đèn.");
                    break;
                case 8:
                    System.out.print("Nhập mã phòng cần cập nhật: ");
                    String capNhatMa = sc.nextLine();
                    System.out.print("Số máy mới: ");
                    int mayMoi = sc.nextInt();
                    if (ds.capNhatSoMayTinh(capNhatMa, mayMoi))
                        System.out.println("Đã cập nhật.");
                    else
                        System.out.println("Không tìm thấy phòng máy tính.");
                    break;
                case 9:
                    System.out.print("Nhập mã phòng cần xóa: ");
                    String xoaMa = sc.nextLine();
                    System.out.print("Bạn có chắc muốn xóa? (true/false): ");
                    boolean xacNhan = sc.nextBoolean();
                    if (xacNhan && ds.xoaPhong(xoaMa))
                        System.out.println("Đã xóa.");
                    else
                        System.out.println("Không xóa.");
                    break;
                case 10:
                    System.out.println("Tổng số phòng: " + ds.tongSoPhong());
                    break;
                case 11:
                    for (PhongMayTinh p : ds.getPhongMay60May())
                        System.out.println(p);
                    break;
            }

        } while (chon != 0);

        sc.close();
    }
}
