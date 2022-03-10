function check(){
    var age = parseInt(prompt("What age are ya?"));
    if (age<18 && age>=0){
        document.getElementById("output").innerHTML="You should probably go. Sam's teaching us to build a site that's not appropriate for kids.";
    } else if (age>=18){
        var name = prompt("What's your name?");
        if (name.toLowerCase()=="sam") {
            document.getElementById("output").innerHTML="Oi! You're barred, you deviant!";
        }
        else {
            document.getElementById("output").innerHTML="Welcome "+name+", you've survived the access guantlet!";
        }
    } else {
        document.getElementById("output").innerHTML="It's a simple question, and you couldn't even get that right. Try again.";
    }
}