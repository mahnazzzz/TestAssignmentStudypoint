<%-- 
    Document   : index
    Created on : 14-Dec-2019, 19:37:52
    Author     : Bruger
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MARIOS Pitzaria</title>
    </head>
    <body>
        <h1>Welcomme to pizza Mario!</h1>
        <form>
            <input type="radio" name="pizza" id="Mafia"/>Mafia 60 $<br/>
            <input type="radio" name="pizza" id="Hawaii"/>Hawaii 44 $<br/>
            <input type="radio" name="pizza" id="Americano"/>Americano 50 $<br/>
            <input type="radio" name="pizza" id="Carbona"/>Carbona 60 $<br/>
            <input type="radio" name="pizza" id="Dennis"/>Dennis 44 $<br/>
            <input type="radio" name="pizza" id="Bertil"/>Bertil 50 $<br/>
            
           
        </form>
          <button id="orderB">order pizza</button><p style="color:blue;"id="oStatus"></p>
        <button id="deleteOrderBtn">remove order</button><p style="color:blue;"id="eStatus"></p>
        <script>
            document.getElementById("orderB").onclick = () => {
                document.getElementById("Show").innerHTML = "order : Hawaii pizza ";

            }
            document.getElementById("deleteOrderB").onclick = () => {        
        setTimeout(function() { document.getElementById("status").innerHTML = "order has been deleted : Hawaii pizza" }, 2000);  
            }
        </script>
    </body>
</html>
