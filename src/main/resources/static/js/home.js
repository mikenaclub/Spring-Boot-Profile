/**
 * Created by mike on 28/6/2560.
 */
function checkProfile() {
    console.log("Check Profile : ")
    $.ajax({
        type: "POST",
        url: "/api/checkProfile",
        success: function (data) {
            console.log(data);
        }
    })
}