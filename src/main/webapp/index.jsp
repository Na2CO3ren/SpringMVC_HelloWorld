<html>
<body>
    <h2>Hello Robin!</h2>

    <a href="robin/testRedirect">Test Redirect</a>
    <br><br>

    <a href="robin/testMyView">Test MyView</a>
    <br><br>

    <a href="robin/testView">Test View</a>
    <br> <br>

    <form action="robin/testModelAttribute" method="post">
        <input type="hidden" name="id" value="1">
        <input type="text" name="name" value="robin">
        <input type="text" name="age" value="12">
        <input type="submit" value="submit">
    </form>

    <a href="robin/testSessionAttribute">Test SessionAttribute</a>
    <br> <br>

    <a href="robin/testMap">Test Map</a>
    <br> <br>

    <a href="robin/testModelAndView">Test ModelAndView</a>
    <br> <br>

    <form action="robin/testMethod" method="post">
        <input type="submit" value="post">
    </form>

    <a href="robin/helloWorld">Hello</a>

    <br> <br>
    <a href="robin/testMethod">Test Post</a>

    <br> <br>
    <a href="robin/testPathVariable/3">Test PathVariable</a>

    <br> <br>
    <form action="robin/testREST" method="post">
        <input type="submit" value="post">
    </form>

    <a href="robin/testREST/1">get</a>
    <br> <br>

    <form action="robin/testREST/1" method="post">
        <input type="hidden" name="_method" value="PUT">
        <input type="submit" value="put">
    </form>
    <br> <br>
    <form action="robin/testREST/1" method="post">
        <input type="hidden" name="_method" value="DELETE">
        <input type="submit" value="delete">
    </form>
    <br> <br>

    <a href="robin/testRequestParam?user=robin&age=18">testRequestParam</a>

    <br> <br>
    <br> <br>
    <br> <br>
    <br> <br>
    <form action="robin/testPOJO" method="post">
        name:<input type="text" name="name">
        password:<input type="password" name="password">
        province:<input type="text" name="address.province">
        city:<input type="text" name="address.city">
        age:<input type="text" name="age">
        <input type="submit" value="submit">
    </form>



</body>
</html>
