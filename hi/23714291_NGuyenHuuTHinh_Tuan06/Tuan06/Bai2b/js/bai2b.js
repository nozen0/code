function Cong() {
    var num1 = parseInt(document.form.num1.value);
    var num2 = parseInt(document.form.num2.value);

    if (isNaN(num1) || isNaN(num2)) {
        alert("Vui lòng nhập số hợp lệ.");
        return;
    }

    var tong = num1 + num2;
    document.form.KQ.value = tong;
}

function Tru() {
    var num1 = parseInt(document.form.num1.value);
    var num2 = parseInt(document.form.num2.value);

    if (isNaN(num1) || isNaN(num2)) {
        alert("Vui lòng nhập số hợp lệ.");
        return;
    }

    var tru = num1 - num2;
    document.form.KQ.value = tru;
}


function Chia() {
    var num1 = parseInt(document.form.num1.value);
    var num2 = parseInt(document.form.num2.value);

    if (isNaN(num1) || isNaN(num2)) {
        alert("Vui lòng nhập số hợp lệ.");
        return;
    }
    
    if (num2 === 0) {
        alert("Không thể chia cho 0.");
        return;
    }

    var chia = num1 / num2;
    document.form.KQ.value = chia;
}

function ChiaDu() {
    var num1 = parseInt(document.form.num1.value);
    var num2 = parseInt(document.form.num2.value);

    if (isNaN(num1) || isNaN(num2)) {
        alert("Vui lòng nhập số hợp lệ.");
        return;
    }
    
    if (num2 === 0) {
        alert("Không thể chia cho 0.");
        return;
    }

    var chiadu = num1 % num2;
    document.form.KQ.value = chiadu;
}
