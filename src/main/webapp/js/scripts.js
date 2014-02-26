var Main = {
    getEmployee : function() {
        $.ajax({
            url : "/get.json",
            dataType : "json",
            success : function (json) {
                var table = $("<table></table>")
                        .addClass('table').addClass('table-hover');
                table.append($("<thead></thead>").append($("<tr></tr>")
                        .append($("<th></th>").text("first name"))
                        .append($("<th></th>").text("last name"))
                        .append($("<th></th>").text("email"))));                
                for (var i = 0; i < json.result.length; i++) {
                    var row = $('<tr></tr>')
                        .append($('<td></td>').text(json.result[i]["firstName"]))
                        .append($('<td></td>').text(json.result[i]["lastName"]))
                        .append($('<td></td>').text(json.result[i]["email"]));                                    
                    table.append(row);
                }
                $("#pageBody").append(table);
                
                $("#cut1").removeClass("active");
                $("#cut2").addClass("active");
                $("#cut3").removeClass("active");
            }
        });
    }
};

