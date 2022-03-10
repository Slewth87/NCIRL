document.getElementById("goTimeA").addEventListener("click", function(){
    firstSet();
    secondSet();
    thirdSet();
});

document.getElementById("goTimeB").addEventListener("click", function(){
    fourthSet();
    fifthSet();
    sixthSet();
});

document.getElementById("goTimeC").addEventListener("click", function(){
    seventhSet();
    eighthSet();
});


function firstSet(){
    var msga = "-100 – 0:</br>";
    for (i=0;i<100;i++){
            var msga = msga + (i-100) + "</br>"
    }
    document.getElementById("outputA").innerHTML = msga;
};

function secondSet(){
    var msgb = "100 – 0:</br>";
    for (i=0;i<100;i++){
        var msgb = msgb + (100-i) + "</br>"
    }
    document.getElementById("outputB").innerHTML = msgb;
};

function thirdSet(){
    var msgc = "-10 – 10 (evens):</br>";
    for(i=(-10);i<=10;i++){
        if (i%2==0){
            var msgc = msgc + i + "</br>"
        }
    }
    document.getElementById("outputC").innerHTML = msgc;
};

function fourthSet(){
    var calc = [0,0,0];
    var msgd = "User gen:</br>";
    for (i=0;i<3;i++){
        calc[i] = parseInt(prompt("Gimme a number to build a loop:"));
    }
    if (calc[0]<calc[1]){
        for (j=calc[0];j<calc[1];j=j+calc[2]){
            var msgd = msgd + j + "</br>"
        }
    } else if (calc[0]>calc[1]) {
        for (j=calc[0];j>=calc[1];j=j-calc[2]){
            var msgd = msgd + j + "</br>"
        }
    } else {
        alert("Different numbers, dummy.")
    }
    document.getElementById("outputD").innerHTML = msgd;
};

function fifthSet(){
    let sum = 0;
    for (i=0;i<10;i++){
        sum = sum + (i+1);
    }
    document.getElementById("outputE").innerHTML = "Summed 1 - 10:</br>"+sum;
};

function sixthSet(){
    let sumA = 0;
    let sumB = 0;
    for (i=0;i<100;i++){
        if ((i+1)%2==0){
            sumA = sumA + (i+1);
        } else {
            sumB = sumB + (i+1);
        }
    }
    document.getElementById("outputF").innerHTML = "Sum all evens to 100:</br>"+sumA+"</br>Sum all odds to 100:</br>"+sumB;
};

function seventhSet(){
    let sumC = 0;
    for (i=0;i<5;i++){
        sumC = sumC + parseInt(prompt("Gimme a number to add:"));
    }
    document.getElementById("outputG").innerHTML = "Your summed numbers:</br>"+sumC;
};

function eighthSet(){
    let calcB = [0,0];
    for (i=0;i<2;i++){
        calcB[i] = parseInt(prompt("Gimme a number to power:"));
    }
    let sumD = calcB[0];
    console.log(sumD)
    for (j=1;j<calcB[1];j++){
        sumD = sumD*calcB[0];
    }
    document.getElementById("outputH").innerHTML = "Your powered numbers:</br>"+sumD;
};