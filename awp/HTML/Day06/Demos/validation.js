function ValidateForEmpty(id, errorid, errorMessage) 
{
        var refToControl = document.getElementById(id);
        var refToErrorControl = document.getElementById(errorid);

        if (refToControl.value == "") {
          refToErrorControl.innerText = errorMessage;
        } else {
          refToErrorControl.innerText = "";
          console.log(refToControl.value);
        }
}