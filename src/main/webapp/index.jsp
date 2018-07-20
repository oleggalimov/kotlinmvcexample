<!DOCTYPE html>
<html lang="ru">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <link rel="icon" href="static/icon/favicon.ico">

  <title>Мое приложение</title>

  <!-- Bootstrap core CSS -->
  <link href="static/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="static/css/jumbotron.css" rel="stylesheet">
</head>

<body>

  <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
    <a class="navbar-brand" href="#">Навигация</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault"
      aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <a class="nav-link" href="#">Домашняя страница
            <span class="sr-only">(current)</span>
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="https://github.com/oleggalimov/springmvcexample">Репозиторий проекта</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Сервисы</a>
          <div class="dropdown-menu" aria-labelledby="dropdown01">
            <a class="dropdown-item" href="http://www.google.com">Google</a>
            <a class="dropdown-item" href="getdate">Текущее время</a>
            <a class="dropdown-item" href="parrot">MD5 шифровальщик</a>
          </div>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="about">О проекте</a>
          </li>
      </ul>
    </div>
  </nav>

  <main role="main">

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h1 class="display-3">Сервисы</h1>
        <p>Данный сайт предоставляет ряд ресурсов, для демонстрации различных веб технологий.</p>
      </div>
    </div>
          <div class="container-fluid">
              <h2>Предоставляемые сервисы</h2>
          <table class="table">
            <thead>
              <tr>
                <th scope="col">№</th>
                <th scope="col">Название</th>
                <th scope="col">Описание</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <th scope="row">1</th>
                <td>MD5 шифровальщик</td>
                <td>Позволяет получить зашифрованную MD5 строку от произвольного текста.</td>
              </tr>
              <tr>
                <th scope="row">2</th>
                <td>Текущее время</td>
                <td>Отобразит текущее время в отдельном окне</td>
              </tr>
              <!-- <tr>
                  <th scope="row">3</th>
                  <td>Закон исключенного третьего</td>
                  <td>Из двух противоречащих суждений если одно истинно, то другое ложно, а третьего не дано.</td>
                </tr> -->
            </tbody>
          </table>
          Все сервисы доступные по ссылкам в группе "Сервисы" вверху страницы
          </div>

  </main>

  <footer class="container">
      <p>&copy; Олег Галимов, 2018<br/>o.d.galimov@yandex.ru</p>
    </footer>

  <!-- Bootstrap core JavaScript
    ================================================== -->
  <!-- Placed at the end of the document so the pages load faster -->
  <script src="static/js/jquery-3.3.1.slim.min.js"></script>
  <script src="static/js/popper.min.js"></script>
  <script src="static/js/bootstrap.min.js"></script>
</body>

</html>