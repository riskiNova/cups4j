package ch.ethz.vppserver.schema.ippclient;

/**
 * Copyright (C) 2008 ITS of ETH Zurich, Switzerland, Sarah Windler Burri
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option) any
 * later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.
 * 
 * See the GNU Lesser General Public License for more details. You should have
 * received a copy of the GNU Lesser General Public License along with this
 * program; if not, see <http://www.gnu.org/licenses/>.
 */

/*Notice
 * This file has been modified. It is not the original. 
 * XML parsing annotations, etc. have been removed Jon Freeman - 2013 */

public class AttributeValue {

  protected SetOfKeyword setOfKeyword;
  protected SetOfEnum setOfEnum;
  protected String tag;
  protected String tagName;
  protected String value;
  protected String description;

  public SetOfKeyword getSetOfKeyword() {
    return setOfKeyword;
  }

  public void setSetOfKeyword(SetOfKeyword value) {
    this.setOfKeyword = value;
  }

  public SetOfEnum getSetOfEnum() {
    return setOfEnum;
  }

   public void setSetOfEnum(SetOfEnum value) {
    this.setOfEnum = value;
  }

  public String getTag() {
    return tag;
  }

  public void setTag(String value) {
    this.tag = value;
  }

  public String getTagName() {
    return tagName;
  }

  public void setTagName(String value) {
    this.tagName = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String value) {
    this.description = value;
  }

}
