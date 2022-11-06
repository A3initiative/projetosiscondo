var dataAtual = new Date();
var dia = dataAtual.getDate();
var mes = (dataAtual.getMonth() + 1);
var ano = dataAtual.getFullYear();
var horas = dataAtual.getHours();
var minutos = dataAtual.getMinutes();
var diaSemana = dataAtual.getDay() + 1;

document.getElementById("dataHora").innerHTML = "Hoje é " + dia + "/" + mes + "/" + ano + ", " + horas + ":" + minutos + ".";