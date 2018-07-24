package com.example.wrap.mydemo.DesignMode.E_agentMode;

/**
 * 追求者
 */
public class Pursuer implements Gift{
    private Gril gril;

    public Pursuer(Gril gril){
        this.gril = gril;
    }


    @Override
    public String sendFlower() {
        return "送花";
    }

    @Override
    public String sendChocolates() {
        return "送巧克力";
    }
}
