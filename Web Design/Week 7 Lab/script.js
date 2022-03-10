function submission(){
    var name = document.getElementById("userName").value;
    var email = document.getElementById("email").value;
    if (name != "" && email != ""){
        document.getElementById("form").style.display = "none";
        document.getElementById("output").innerHTML=name+", thank you for your details. We will be in touch via " + email + " shortly.";
        document.getElementById("output").style.display = "block";
        event.preventDefault();
    }
}