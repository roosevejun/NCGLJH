//picture scroll
(function () {
    var $picScrollBox = $('.middle'),
        $ul           = $picScrollBox.find('.picture'),
        $len          = $ul.children('li').length,
        $dot          = $('.dot');
    if ($len <= 1) {
        $dot.hide();
        return;
    }
    var idx = 0;
    var _unit;
    $ul.find('li').width(document.body.clientWidth);
    _unit   = $ul.find('li').first().width();
    $ul.width($len * _unit);
    $(window).on('resize', function () {
        $ul.find('li').width(document.body.clientWidth);
        _unit = $ul.find('li').first().width();
        $ul.width($len * _unit);
    });
    function scrollLeft() {
        idx++;
        if (idx > $len - 1) {
            idx = 0;
        }
        changeDot(idx);
        $ul.animate({left: '-=' + (_unit)}, 1000, '', function () {
            $ul.css('left', '0');
            $ul.find('li').first().appendTo($ul);

        })
    }

    function changeDot(idx) {
        $dot.find('li').removeClass('active').eq(idx).addClass('active');
    }

    setInterval(scrollLeft, 1000 * 10);

})();