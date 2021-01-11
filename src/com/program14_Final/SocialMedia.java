package com.program14_Final;

class SocialMedia {
  //
  String name;
}

// this class cannot be inherited
final class Facebook extends SocialMedia {

}
/**
class FakeFacebook extends Facebook {
  //...
}
*/

class Twitter extends SocialMedia {
  // this method cannot be overriding
  final void login(String username, String password) {
    //...
  }
}
/**
class FakeTwitter extends Twitter {
  void login(String username, String password) {
    //...
  }
}
*/
