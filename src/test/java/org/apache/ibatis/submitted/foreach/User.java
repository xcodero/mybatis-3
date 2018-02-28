/**
 *    Copyright 2009-2018 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.submitted.foreach;

import java.util.List;

public class User {

  private Integer id;
  private String name;
  private User bestFriend;
  private List<User> friendList;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User getBestFriend() {
    return bestFriend;
  }

  public void setBestFriend(User bestFriend) {
    this.bestFriend = bestFriend;
  }

  public List<User> getFriendList() {
    return friendList;
  }

  public void setFriendList(List<User> friendList) {
    this.friendList = friendList;
  }
}
