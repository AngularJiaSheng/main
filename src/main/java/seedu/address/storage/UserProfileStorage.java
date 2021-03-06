package seedu.address.storage;

import java.io.IOException;
import java.util.Optional;

import seedu.address.commons.exceptions.DataConversionException;
import seedu.address.model.person.UserPerson;

//@@author bladerail
/**
 * Represents a storage for {@link seedu.address.model.AddressBook}.
 */
public interface UserProfileStorage {

    /**
     * Returns the file path of the UserProfile data file.
     */
    String getUserProfileFilePath();

    /**
     * Returns UserProfile data from storage.
     *   Returns {@code Optional.empty()} if storage file is not found.
     * @throws DataConversionException if the data in storage is not in the expected format.
     * @throws IOException if there was any problem when reading from the storage.
     */
    Optional<UserPerson> readUserProfile() throws DataConversionException, IOException;

    /**
     * Saves the given {@link UserPerson} to the storage.
     * @param userPerson cannot be null.
     * @throws IOException if there was any problem writing to the file.
     */
    void saveUserPerson(UserPerson userPerson, String filePath) throws IOException;

    void saveUserPerson(UserPerson userPerson) throws IOException;

}
