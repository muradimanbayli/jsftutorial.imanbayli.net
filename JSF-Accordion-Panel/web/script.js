/* 
 * script.js
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on May 30, 2016  2:36:32 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
function onSelectTab(title) {
    var icon = title.firstElementChild;
    var parent = title.parentNode;
    var p = parent.childNodes[3];
    if (title.className == "selected-panel") {
        title.className = "";
        icon.innerHTML = "+";
        p.style.display = "none";
    } else {
        title.className = "selected-panel";
        icon.innerHTML = "-";
        p.style.display = "block";
    }

}


