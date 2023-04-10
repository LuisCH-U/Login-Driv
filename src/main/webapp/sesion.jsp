<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<head>
    <link rel="stylesheet" href="css/style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>
    <title>Inicio-Registro</title>
</head>
<style>
  body{background-image: url("img/4.jpg");}
</style>

<body>
<div class="container-form sign-up">
        <form class="formulario">
            <h2 class="create-account">Iniciar Sesion</h2>
            <div class="iconos">
                <div class="border-icon">
                    <i class='bx bxl-instagram' ></i>
                </div>
                <div class="border-icon">
                    <i class='bx bxl-linkedin' ></i>
                </div>
                <div class="border-icon">
                    <i class='bx bxl-facebook-circle' ></i>
                </div>
            </div>
            <p class="cuenta-gratis">¿Aun no tienes una cuenta?</p>
            <input type="email" placeholder="Email">
            <input type="password" placeholder="Contraseña">
           <button> <a href="svl_inicio" class="list-group-item"> <strong>Iniciar Sesion </strong></a></button>
        </form>
        <div class="welcome-back">
            <div class="message">
                <h2>Bienvenido a Home-Driv SAC </h2>
                <p>Si aun no tienes una cuenta por favor registrese aqui</p>
                <button class="sign-in-btn">Registrarse</button>
            </div>
        </div>
    </div>
    <div class="container-form sign-in">
        <div class="welcome-back">
            <div class="message">
                <h2>Bienvenido a Home-Driv SAC</h2>
                <p>Si ya tienes una cuenta por favor inicia Sesion Aqui</p>
                <button class="sign-up-btn">Iniciar Sesion</button>
            </div>
        </div>
        <form class="formulario">
            <h2 class="create-account">Crear una cuenta</h2>
            <div class="iconos">
                <div class="border-icon">
                    <i class='bx bxl-instagram'></i>
                </div>
                <div class="border-icon">
                    <i class='bx bxl-linkedin' ></i>
                </div>
                <div class="border-icon">
                    <i class='bx bxl-facebook-circle' ></i>
                </div>
            </div>
            <p class="cuenta-gratis">Crear una cuenta gratis</p>
            <input type="text" placeholder="Nombre">
            <input type="email" placeholder="Email">
            <input type="password" placeholder="Contraseña">
            <button> <a href="sesion.jsp" class="list-group-item"><strong>Registrate</strong></a></button>
        </form>
    </div>
    <script src="js/script.js"></script>
</body>


<footer>
    <center>
        <h1>
            <a href="index.jsp" class="border-icon "><strong> Inicio </strong></a>
        </h1>
        <p>Copyright © 2023 ® 201........17-FroilanLuisChipanaUrbina - Todos los Derechos son Reservados</p>
        <div>
            <img src="img/cp-logo2.png" alt="Copyright" height="50">
        </div>
    </center>
</footer>
</html>