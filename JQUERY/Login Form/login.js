
  $(document).ready(function(){
      $('#login').addClass('btn btn-info');
      $('#signup').addClass('btn btn-info');

      $('input:submit').addClass('btn btn-primary');
      $('input:reset').addClass('btn btn-primary');

      $('#signup_div').hide();

      $('#signup').click(function(){
        $('#signup_div').toggle("slide");

      });



       });
