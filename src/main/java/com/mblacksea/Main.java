package com.mblacksea;

import com.mblacksea.chain.ChainHandler;
import com.mblacksea.chain.ConstructionChain;
import com.mblacksea.chain.EligibilityChain;
import com.mblacksea.chain.PostProcessChain;
import com.mblacksea.chain.PreProcessChain;
import com.mblacksea.chain.RouteChain;
import com.mblacksea.model.Data;

public class Main {

  public static void main(String[] args) {
    Data data = new Data("NEW DATA");

    ChainHandler preProcessChainHandler = new PreProcessChain();
    ChainHandler eligibilityChainHandler = new EligibilityChain();
    ChainHandler constructionChainHandler = new ConstructionChain();
    ChainHandler postProcessChainHandler = new PostProcessChain();
    ChainHandler routeChainHandler = new RouteChain();

    preProcessChainHandler.nextChainHandler(eligibilityChainHandler);
    eligibilityChainHandler.nextChainHandler(constructionChainHandler);
    constructionChainHandler.nextChainHandler(postProcessChainHandler);
    postProcessChainHandler.nextChainHandler(routeChainHandler);

    preProcessChainHandler.execute(data);
  }
}
