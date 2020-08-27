package com.mblacksea.util;

public final class GeneralEnumerationDefinition {

  public enum ChainState {
    PRE_PROCESS(0, "PreProcess"),
    ELIGIBILITY(1, "Eligibility"),
    CONSTRUCTION(2, "Construction"),
    POST_PROCESS(3, "PostProcess"),
    ROUTE(4, "Route");

    private int code;
    private String description;

    ChainState(int code, String description) {
      this.code = code;
      this.description = description;
    }

    public int getCode() {
      return code;
    }

    public String getDescription() {
      return description;
    }
  }


}
