function nhap()
{
    a = prompt('Nhập vào mssv: ');
    b = prompt('Nhập vào Tên: ');
    c = prompt('Nhập vào Lớp:');
    $ = document.querySelector.bind(document);
    const mssv = $('.mssv');
    const ten = $('.ten');
    const lop = $('.lop');
    mssv.innerText = a;
    ten.innerText = b;
    lop.innerText = c;
}