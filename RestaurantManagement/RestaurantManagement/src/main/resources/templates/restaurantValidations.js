
function validation(){
let x1 = document.getElementById("restaurantName");
  if (x1.value == "") {
    document.getElementById("p1").innerHTML = "*Restaurant Name should not be empty*";
    return false;
  }

  let x2 = document.getElementById("address");
  if (x1.value == "") {
    document.getElementById("p2").innerHTML = "*Address field should not be empty*";
    return false;
  }
    let x3 = document.getElementById("firstname");

  if (x1.value == "") {
    document.getElementById("p3").innerHTML = "*select atleast one check box*";
    return false;
  }

 }
