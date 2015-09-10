/*global cordova, module*/

module.exports = {
    greet: function (action, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "onefourone", action, ['World']);
    }
};
