function dangky()
{
    var hoten = document.getElementById("ten").value;
    var pass = document.getElementById("pass").value;
    localStorage.setItem('t', hoten);
    localStorage.setItem('p', pass);
}