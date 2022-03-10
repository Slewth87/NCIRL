const students=["Jack","Mary","Jill","Jane"];
function picker(){
    let choice=parseInt(prompt("There are four students.\nWhich one do you want to know; 1, 2, 3, or 4?"));
    document.getElementById("output").innerHTML=students[choice-1];
}