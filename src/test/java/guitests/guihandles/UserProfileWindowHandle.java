package guitests.guihandles;

import guitests.GuiRobot;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

//@@author bladerail
/**
 * Provides a handle for the UserProfileWindow
 */
public class UserProfileWindowHandle extends StageHandle {
    public static final String USERPROFILE_WINDOW_TITLE = "User Profile";

    private static final String NAME_FIELD_ID = "#nameTextField";
    private static final String PHONE_FIELD_ID = "#phoneTextField";
    private static final String ADDRESS_FIELD_ID = "#addressTextField";
    private static final String EMAIL_FIELD_ID = "#emailTextField";
    private static final String WEBLINK_FIELD_ID = "#webLinkTextField";

    private final TextField nameTextField;
    private final TextField phoneTextField;
    private final TextField addressTextField;
    private final TextField emailTextField;
    private final TextField webLinkTextField;

    public UserProfileWindowHandle(Stage userProfileWindowStage) {
        super(userProfileWindowStage);

        this.nameTextField = getChildNode(NAME_FIELD_ID);
        this.phoneTextField = getChildNode(PHONE_FIELD_ID);
        this.addressTextField = getChildNode(ADDRESS_FIELD_ID);
        this.emailTextField = getChildNode(EMAIL_FIELD_ID);
        this.webLinkTextField = getChildNode(WEBLINK_FIELD_ID);
    }

    /**
     * Returns true if the UserProfile window is currently present in the application.
     */
    public static boolean isWindowPresent() {
        return new GuiRobot().isWindowShown(USERPROFILE_WINDOW_TITLE);
    }

    /**
     * Opens the {@code UserProfileWindow} by pressing the shortcut key associated
     * with the menu bar in {@code UserProfileWindow}.
     */
    public void closeUserProfileWindowUsingAccelerator() {
        guiRobot.push(KeyCode.ENTER);
    }

    public String getName() {
        return nameTextField.getText();
    }

    public String getPhone() {
        return phoneTextField.getText();
    }

    public String getAddress() {
        return addressTextField.getText();
    }

    public String getEmail() {
        return emailTextField.getText();
    }

    public String getWebLink() {
        return webLinkTextField.getText();
    }
}
