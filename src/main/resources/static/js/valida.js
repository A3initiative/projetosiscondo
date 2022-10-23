document.getElementById("moradorResponsavel").style.display = "none";
document.getElementById("blocoMorador").style.display = "none";
document.getElementById("andarMorador").style.display = "none";
document.getElementById("unidadeMorador").style.display = "none";
document.getElementById("matricula").style.display = "none";
document.getElementById("tipoUsuario").innerHTML = "Nome do(a) usuário(a)";

function exibeCampos() {
  if (document.getElementById("selectPerfil").value == "Mor") {
    document.getElementById("moradorResponsavel").style.display = "block";
    document.getElementById("blocoMorador").style.display = "block";
    document.getElementById("andarMorador").style.display = "block";
    document.getElementById("unidadeMorador").style.display = "block";
    document.getElementById("matricula").style.display = "none";
    document.getElementById("tipoUsuario").innerHTML =
      "Nome do(a) usuário(a) Morador(a)";
  } else if (document.getElementById("selectPerfil").value == "Men") {
    document.getElementById("moradorResponsavel").style.display = "none";
    document.getElementById("blocoMorador").style.display = "none";
    document.getElementById("andarMorador").style.display = "none";
    document.getElementById("unidadeMorador").style.display = "none";
    document.getElementById("matricula").style.display = "block";
    document.getElementById("tipoUsuario").innerHTML =
      "Nome do(a) usuário(a) Mensageiro(a)";
  } else if (document.getElementById("selectPerfil").value == "Sup") {
    document.getElementById("moradorResponsavel").style.display = "none";
    document.getElementById("blocoMorador").style.display = "none";
    document.getElementById("andarMorador").style.display = "none";
    document.getElementById("unidadeMorador").style.display = "none";
    document.getElementById("matricula").style.display = "block";
    document.getElementById("tipoUsuario").innerHTML =
      "Nome do(a) usuário(a) Supervisor(a)";
  } else {
    document.getElementById("moradorResponsavel").style.display = "none";
    document.getElementById("blocoMorador").style.display = "none";
    document.getElementById("andarMorador").style.display = "none";
    document.getElementById("unidadeMorador").style.display = "none";
    document.getElementById("matricula").style.display = "none";
    document.getElementById("tipoUsuario").innerHTML = "Nome do(a) usuário(a)";
  }
}
