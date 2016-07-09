// Include app dependency on ngMaterial
var myApp = angular.module( 'myApp', [ 'ngMaterial' ] );
myApp.controller('Controller', ['$scope', function($scope) {
  $scope.name = 'Tobias';
}])
.directive('myDialog', function() {
  return {
    restrict: 'E',
    transclude: true,
    scope: {},
    template: '<div class="alert">name:{{name}} </div>',
    link: function (scope) {
//      scope.name = 'Jeff';
    }
  };
});