var FoxMain;
FoxMain = (function() {
  function FoxMain() {}
  FoxMain.prototype.fadeIn = function(selector) {
    return $("" + selector).fadeIn(1000);
  };
  return FoxMain;
})();
this.fox = new FoxMain();