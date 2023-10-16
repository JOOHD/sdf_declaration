<script>
    window.dataLayer = window.dataLayer || [];
    function gtag() {
      dataLayer.push(arguments);
    }
    gtag("js", new Date());
    gtag("config", "UA-15159757-1");
  
    $(document).ready(function () {
      // 접근 토큰 값 출력
      var DI = "MC0GCCqGSIb3DQIJAyEAXvEyQQrQBzm0CpfmiAJYb5KUIVX34UEWt/POaKp1m/4=";
  
      console.log("DI:[" + DI + "]");
  
      //본인인증 확인
      if (DI == "") {
        alert("본인인증을 해주세요.");
        location.href = "/?menuno=476";
      }
  
      // 입력값
      var title = $("#title").val();
      var content = $("#content").val();
  
      // 핸드폰
      $("#mobile2").focusout(function () {
        var mobile2 = $("#mobile2").val().trim();
        $("#mobile2").val(mobile2);
      });
  
      $("#mobile3").focusout(function () {
        var mobile3 = $("#mobile3").val().trim();
        $("#mobile3").val(mobile3);
      });
  
      // 이메일
      $("#email_id").focusout(function () {
        var email_id = $("#email_id").val().trim();
        $("#email_id").val(email_id);
      });
  
      $("#email_domain").focusout(function () {
        var email_domain = $("#email_domain").val().trim();
        $("#email_domain").val(email_domain);
      });
  
      // domain 자동입력
      $("#email_sel").change(function () {
        if ($("#email_sel").val() == "0") {
          $("#email_domain").prop("readonly", false);
          $("#email_domain").val("");
        } else {
          $("#email_domain").prop("readonly", true);
          console.log("select value:" + $("#email_sel option:selected").val());
          $("#email_domain").val($("#email_sel option:selected").val());
        }
      });
  
      // 내용글자 2000자 제한
      $("#content").on("keyup", function () {
        var num_count = $(this).val().length;
        var input_count = num_count
          .toString()
          .replace(/\B(?<!\.\d*)(?=(\d{3})+(?!\d))/g, ",");
        $("#input_cnt").html("(" + input_count + " / 2,000) 글자");
  
        if ($(this).val().length > 2000) {
          $(this).val($(this).val().substring(0, 2000));
          $("#input_cnt").html("(2,000 / 2,000) 글자");
        }
      });
    });
  
    // 파일
    $(".fileBtn").bind("change", function () {
      var fileValue = $(".fileBtn").val().split("\\");
      var fileName = fileValue[fileValue.length - 1]; // 파일명
      $(".attach_file").val(fileName);
    });
  </script>
  