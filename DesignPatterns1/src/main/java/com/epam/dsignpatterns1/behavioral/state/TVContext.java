package com.epam.dsignpatterns1.behavioral.state;

public class TVContext implements State {

	private State tvState;

	public void setState(State state) {
		this.tvState=state;
	}

	public State getState() {
		return this.tvState;
	}

	public void doAction() {
		this.tvState.doAction();
	}

}
