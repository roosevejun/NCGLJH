function leftMenuOnload() {
    var show_item;
    if ($.cookie("show_item") != null || $.cookie("show_item") != undefined) {
        show_item = $("#" + $.cookie("show_item"));
    } else {
        show_item = $("#menu li[class*=item]:first ul[class^=optiton]");
    }
    $("#menu li a[class^=title]").bind("click", function () {
        if ($.cookie('show_item') == $(this).next().attr("id")) {
            if ($(this).closest("li[class*=active]").length > 0) {
                $(this).next().css("display", "none");
                $(this).next().find("li[class^=minus]").find("a").trigger("click");
                $(this).closest("li.item").removeClass("active").addClass("default");
            } else {
                $(this).next().css("display", "block");
                $(this).closest("li.item").removeClass("active").addClass("default");
                $(this).closest("li.item").removeClass("default").addClass("active");
                $(this).next().find("li[class^=plus]:first").find("a").trigger("click");
                $(this).next().find("li[class*=linkUrl] a:first").trigger("click");
            }
        } else {
            $("#menu li[class*=active] ul[class^=optiton]").css("display", "none");
            $("#menu li[class*=active]").removeClass("active").addClass("default");
            $(this).closest("li.item").removeClass("default").addClass("active");
            $(this).next().css("display", "block");
            $(this).next().find("li[class^=plus]:first").find("a").trigger("click");
            $(this).next().find("li[class*=linkUrl] a:first").trigger("click");
        }
        $.cookie('show_item', $(this).closest("li.item").find("ul.optiton:first").attr("id"));
    });
    $("#menu li.item li[class*=plus]").bind("click", function () {
        if ($(this).next().css("display") != 'block') {
            $(this).closest("li").removeClass().addClass("minus");
            $(this).next().css("display", "block");
            $(this).closest("ul.optiton").find("li[class*=minus]:last").removeClass().addClass("minusBottom");
        } else {
            $(this).next().css("display", "none");
            $(this).closest("li").removeClass().addClass("plus");
            $(this).closest("ul.optiton").find("li[class*=plus]:last").removeClass().addClass("plusBottom");
        }
    });
    $("#menu li.item ul li[class*=linkUrl] a").bind("click", function (){
        $("#center-panel").omPanel("reload", $(this).attr("linkUrl"));
        clearInterval(interval);
    });
    show_item.closest("li.item").find("a[class^=title]").trigger("click");
}