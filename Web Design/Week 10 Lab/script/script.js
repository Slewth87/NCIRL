let groceries=[];
function loader(){
    let buildList = "";
    for (i=0;i<groceries.length;i++) {
        buildList = buildList + "<li><div class='row justify-content-between'><p class='col-3'>"+groceries[i]+"</p><button class='closer verticals buttons col-1 ps-2' onclick='removeItem("+i+")'>x</button></div></li>";
    }
    document.getElementById("list").innerHTML = buildList + "<li><form class='row justify-content-between ps-2'><input type='text' id='newItem' class='col-6 verticals'><input type='submit' value='Add' class='buttons verticals col-2' onclick='addItem()'></input></form></li>";
    document.getElementById("newItem").focus();
}

function addItem(){
    groceries.push(document.getElementById("newItem").value);
    loader();
}

function removeItem(position){
    groceries.splice(position,1)
    loader();
}

function output(){
    for (i=0;i<groceries.length;i++) {
        console.log(i+": "+groceries[i]);
    } 
}