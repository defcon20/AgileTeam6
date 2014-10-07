console.clear();

$('.register').hide();
$('.backend').hide();
$('.help').hide();
$('.SecurityAlert').hide();
$('#navBack').hide();

$('#loginSubmit').on('click', function (e) {

    $('.warning').html('');
    $url = 'http://davidliou.net/agile/php/login.php?username='+$('#username').val()+'&password='+$('#password').val();
    console.log($url);
    $.get($url, function(data){
        console.log(data);
        if(data==='0'){
            $('.warning').html('Username or password wrong');
        }else{
            $('.register').hide();
            $('.myForm').hide();
            $('.backend').show();
            $('.phName').html($('#username').val());

            var secLeft = 5;
            $('.secondsLeft').html(secLeft);

            var myInt = setInterval(function () {
                if (secLeft===1){
                    clearInterval(myInt);
                }
                secLeft--;
                $('.secondsLeft').html(secLeft);

            }, 1000);

            $('#cancelButton').on('click', function () {
                clearInterval(myInt);
            });

        }
    });
    e.preventDefault();

});

$('#registerButton').on('click', function () {
    $('.myForm').hide();
    $('.register').show();
});

$('#registerSubmit').on('click', function (e) {
    $('.warning').html('');
    $url = 'http://davidliou.net/agile/php/auth.php?username='+$('#regUsername').val()+'&password='+$('#regPassword').val();
    console.log($url);
    $.get($url, function(data){
        console.log(data);
        if(data==='0'){
            $('.warning').html('Username already exists');
        }else{
            $('.myForm').show();
            $('.register').hide();
        }
    });
    e.preventDefault();
});

//when click on logout button exits to the Login Page
$('#logoutButton').on('click', function () {
    $('.myForm').show();
    $('.backend').hide();
    $('#navBack').hide();
});

//jumps to help page
$('#helpButton').on('click', function () {
    $('.help').show();
    $('.backend').hide();
});
//this is the button that brings you back from the help page
$('#homeButton').on('click', function () {
    $('.help').hide();
    $('.backend').show();
});

$('#loginSubmit').on('click', function (){

    $('#navBack').show();

});


