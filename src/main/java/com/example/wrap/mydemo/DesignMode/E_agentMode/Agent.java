package com.example.wrap.mydemo.DesignMode.E_agentMode;

/**
 * 代理人
 */
public class Agent implements Gift{
    private Pursuer pursuer ;
    private Gril gril;

    public Agent(Gril gril){
        pursuer = new Pursuer(gril);
    }

    @Override
    public String sendFlower() {
        return pursuer.sendFlower();
    }

    @Override
    public String sendChocolates() {
        return pursuer.sendChocolates();
    }
}
