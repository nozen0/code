var imgs = ['../images/b1.jpg', '../images/b2.jpg', '../images/b3.jpg',
    '../images/b4.jpg', '../images/b5.jpg', '../images/b6.jpg', '../images/b7.jpg', '../images/b8.jpg',
    '../images/b9.jpg', '../images/b10.jpg'];
function slideImg() {
    var index = Math.floor(Math.random() * imgs.length);
    var img = imgs[index];
    document.getElementById('img').src = img;
};
document.getElementById('play').addEventListener('click', function (){
    intervalId = setInterval(slideImg, 1000);
});

document.getElementById('stop').addEventListener('click', function (){
    clearInterval(intervalId);
});
