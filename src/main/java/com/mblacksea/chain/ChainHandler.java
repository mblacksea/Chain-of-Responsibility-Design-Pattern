package com.mblacksea.chain;

import com.mblacksea.model.Data;
import com.mblacksea.util.GeneralEnumerationDefinition.ChainState;

public abstract class ChainHandler {

  public abstract Data process(Data data);

  public abstract ChainState getChainState();

  private ChainHandler chainHandler;

  public void nextChainHandler(ChainHandler chainHandler) {
    this.chainHandler = chainHandler;
  }

  public void execute(Data data) {
    this.process(data);
    if (chainHandler != null) {
      chainHandler.execute(data);
    }
  }


}
