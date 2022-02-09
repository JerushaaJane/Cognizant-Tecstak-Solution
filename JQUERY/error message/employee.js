//WRITE YOUR jQUERY CODE HRE


  $(document).ready(function(){
    $('#btn-id').click(function(){
      $.ajax({
        url:'index.js',error:function(){
          $('#err-id').html("Error Message : Not Found");
        }
      });
    });
  });
