/**
 * Created by davidliou on 10/4/14.
 */

var x = true;

$('#cancelButton').on('click', function () {
    x = false;
    $('.SecurityAlert').hide();
    timerCancelled = true;
    /*
     $.get( "ajax/test.html", function( data ) {
     $( ".result" ).html( data );
     alert( "Load was performed." );
     });
     //update server false
     */
});

function securityAlert(x) {
    if (x === true) {
        $('.SecurityAlert').show();
    }
}

securityAlert(x);
