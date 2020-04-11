$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/project/proj/src/test/resources/Feature/Features/log.feature");
formatter.feature({
  "line": 1,
  "name": "OpenCart Test",
  "description": "",
  "id": "opencart-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate LoginPage",
  "description": "",
  "id": "opencart-test;validate-loginpage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User Opens Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is on OpenCart",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Clicks on loginPage",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User Enters Username name Password and submits",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Homepage appears",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageTest.User_Opens_Browser()"
});
formatter.result({
  "duration": 15488155699,
  "status": "passed"
});
formatter.match({
  "location": "HomepageTest.User_is_on_OpenCart()"
});
formatter.result({
  "duration": 108518000,
  "status": "passed"
});
formatter.match({
  "location": "HomepageTest.User_Clicks_on_loginPage()"
});
formatter.result({
  "duration": 1650088300,
  "status": "passed"
});
formatter.match({
  "location": "HomepageTest.User_Enters_Username_name_Password_and_submits()"
});
formatter.result({
  "duration": 4264065900,
  "status": "passed"
});
formatter.match({
  "location": "HomepageTest.Homepage_appears()"
});
formatter.result({
  "duration": 551533101,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Validate EditPage",
  "description": "",
  "id": "opencart-test;validate-editpage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "User is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User clicks on Edit Account Page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User is on EditAccountPage",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User Changes First name and Last name and submits",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Successfully changed",
  "keyword": "Then "
});
formatter.match({
  "location": "EditAccountPageTest.User_is_on_HomePage()"
});
formatter.result({
  "duration": 18159153701,
  "status": "passed"
});
formatter.match({
  "location": "EditAccountPageTest.User_clicks_on_Edit_Account_Page()"
});
formatter.result({
  "duration": 1562658101,
  "status": "passed"
});
formatter.match({
  "location": "EditAccountPageTest.User_is_on_EditAccountPage()"
});
formatter.result({
  "duration": 11293000,
  "status": "passed"
});
formatter.match({
  "location": "EditAccountPageTest.User_Changes_First_name_and_Last_name_and_submits()"
});
formatter.result({
  "duration": 4750177900,
  "status": "passed"
});
formatter.match({
  "location": "EditAccountPageTest.Successfully_changed()"
});
formatter.result({
  "duration": 935505300,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Validate WishListPage",
  "description": "",
  "id": "opencart-test;validate-wishlistpage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "User is on the HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User clicks on WishListPage",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User is on wishlistpage",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User Adds item to wish list through search",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "product appears on wishlist",
  "keyword": "Then "
});
formatter.match({
  "location": "WishListPageTest.User_on_Home()"
});
formatter.result({
  "duration": 18258309900,
  "status": "passed"
});
formatter.match({
  "location": "WishListPageTest.User_clicks_on_WishListPage()"
});
formatter.result({
  "duration": 2586544100,
  "status": "passed"
});
formatter.match({
  "location": "WishListPageTest.User_is_on_wishlistpage()"
});
formatter.result({
  "duration": 12782600,
  "status": "passed"
});
formatter.match({
  "location": "WishListPageTest.User_Adds_item_to_wish_list_through_search()"
});
formatter.result({
  "duration": 2974742300,
  "status": "passed"
});
formatter.match({
  "location": "WishListPageTest.product_appears_on_wishlist()"
});
formatter.result({
  "duration": 2201031399,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Validate Comparision",
  "description": "",
  "id": "opencart-test;validate-comparision",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "User is on Home",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "User searches a product and adds to compare page",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "User adds 2nd product to compare page",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "items appears on compare page",
  "keyword": "Then "
});
formatter.match({
  "location": "ComparisionTest.User_on_Home()"
});
formatter.result({
  "duration": 18542700900,
  "status": "passed"
});
formatter.match({
  "location": "ComparisionTest.User_adds_product_to_compare()"
});
formatter.result({
  "duration": 5544504099,
  "status": "passed"
});
formatter.match({
  "location": "ComparisionTest.User_adds_2nd_product()"
});
formatter.result({
  "duration": 2583195501,
  "status": "passed"
});
formatter.match({
  "location": "ComparisionTest.Verify_comparision()"
});
formatter.result({
  "duration": 545212200,
  "status": "passed"
});
});