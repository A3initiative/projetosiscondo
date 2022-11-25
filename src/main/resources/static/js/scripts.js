var dataAtual = new Date();
var dia = dataAtual.getDate();
var mes = (dataAtual.getMonth() + 1);
var ano = dataAtual.getFullYear();
var horas = dataAtual.getHours();
var minutos = dataAtual.getMinutes();
var diaSemana = dataAtual.getDay() + 1;

document.getElementById("dataHora").innerHTML = "Hoje é " + dia + "/" + mes + "/" + ano + ", " + horas + "h" + minutos + ".";

let theme = localStorage.getItem('data-theme');
const changeThemeToDark = () => {
    document.documentElement.setAttribute("data-theme", "dark") // set theme to dark
    localStorage.setItem("data-theme", "dark") // save theme to local storage
}

const changeThemeToLight = () => {
    document.documentElement.setAttribute("data-theme", "light") // set theme light
    localStorage.setItem("data-theme", 'light') // save theme to local storage
}

// Get the element based on ID
const link = document.getElementById("constraste");
// Apply retrived them to the website
link.addEventListener('change', () => {
    let theme = localStorage.getItem('data-theme'); // Retrieve saved them from local storage
    if (theme ==='dark'){
        changeThemeToLight()
    }else{
        changeThemeToDark()
    }   
});


/* controle do tamanho de letras */
tamanho = 16;
function diminuir(){
  tamanho--;
  document.body.style.fontSize=tamanho+"px";
}
function aumentar(){
  tamanho++;
  document.body.style.fontSize=tamanho+"px";
}