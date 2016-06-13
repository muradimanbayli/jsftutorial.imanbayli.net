/* 
 * jsfscript.js
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Jun 13, 2016  11:22:37 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
function ajax(data) {
    var status = data.status;
    if (status == "begin") {
        setInterval(function () {
            var progressValue = document.getElementById("progress").innerHTML;
            if (progressValue != '100%') {
                document.getElementById("form:refresh").click();
            }

        }, 1000);
    }
}


