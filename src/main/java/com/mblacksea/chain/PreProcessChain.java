package com.mblacksea.chain;

import com.mblacksea.model.Data;
import com.mblacksea.util.GeneralEnumerationDefinition.ChainState;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PreProcessChain extends ChainHandler {

  @Override
  public Data process(Data data) {
    log.info(data.toString() + " State: " + getChainState());
    return data;
  }

  @Override
  public ChainState getChainState() {
    return ChainState.PRE_PROCESS;
  }
}
