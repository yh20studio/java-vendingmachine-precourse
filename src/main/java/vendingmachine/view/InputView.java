package vendingmachine.view;

public class InputView {
	private static final String INITIAL_MONEY_SETTING = "자판기가 보유하고 있는 금액을 입력해 주세요.";

	public static void showInitialMoneySettingMessage() {
		System.out.println(INITIAL_MONEY_SETTING);
	}
}