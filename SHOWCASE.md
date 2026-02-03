# Vault App - Feature Showcase

This document showcases the key features of Vault App through video demonstrations. Each demo highlights specific functionality and user workflows.

---

## 1. Initial Setup

**Video:** [setup_app.mp4](demo/setup_app.mp4)

https://github.com/user-attachments/assets/setup_app.mp4

**Description:**  
First-time vault creation workflow demonstrating:
- BIP-39 passphrase generation (12-word mnemonic)
- Passphrase confirmation step
- 6-digit PIN setup with numeric keypad
- Optional biometric authentication enrollment
- Complete vault initialization

---

## 2. Adding Platforms

**Video:** [adding_platforms.mp4](demo/adding_platforms.mp4)

https://github.com/user-attachments/assets/adding_platforms.mp4

**Description:**  
Platform management showing:
- Creating new platforms with name and domain
- Selecting platform types (Social, Gaming, Email, Work, etc.)
- Creating custom platform types
- Reusing existing custom types from dropdown selection
- Platform icon generation from favicon

---

## 3. Adding Credentials

**Video:** [adding_credentials.mp4](demo/adding_credentials.mp4)

https://github.com/user-attachments/assets/adding_credentials.mp4

**Description:**  
Credential creation across multiple types:
- Standard credentials (username, password, email)
- Social media credentials (with 2FA, phone, recovery email)
- Crypto wallet credentials (address, private key, seed phrase)
- Google account credentials (full recovery fields)
- Email and username validation with sanitization
- Password strength indicator
- Platform selection and association

---

## 4. Viewing Credentials

**Video:** [view_credential.mp4](demo/view_credential.mp4)

https://github.com/user-attachments/assets/view_credential.mp4

**Description:**  
Secure credential viewing workflow:
- PIN verification with numeric keypad before viewing
- Optional biometric authentication
- Displaying encrypted credential fields
- Copy-to-clipboard for sensitive data
- Password visibility toggle
- Compact modal layout with reduced empty space

---

## 5. Editing Credentials

**Video:** [editing_credential.mp4](demo/editing_credential.mp4)

https://github.com/user-attachments/assets/editing_credential.mp4

**Description:**  
Credential modification features:
- Updating username, password, and other fields
- Field validation (email format, username sanitization)
- Password strength meter during edits
- Platform reassignment
- Saving changes with encryption

---

## 6. Deleting Credentials

**Video:** [deleting_credential.mp4](demo/deleting_credential.mp4)

https://github.com/user-attachments/assets/deleting_credential.mp4

**Description:**  
Credential deletion with security:
- Delete confirmation dialog
- PIN verification with numeric keypad
- Optional biometric confirmation
- Secure data clearing from database

---

## 7. Editing Platforms

**Video:** [editing_platform.mp4](demo/editing_platform.mp4)

https://github.com/user-attachments/assets/editing_platform.mp4

**Description:**  
Platform modification with restrictions:
- Updating platform name, domain, and type
- 24-hour name edit cooldown enforcement
- Countdown timer display for restricted edits
- Duplicate name/domain validation
- Custom type support

---

## 8. Deleting Platforms

**Video:** [deleting_platform.mp4](demo/deleting_platform.mp4)

https://github.com/user-attachments/assets/deleting_platform.mp4

**Description:**  
Platform deletion workflow:
- Delete confirmation with credential count warning
- PIN verification with numeric keypad
- Optional biometric authentication
- Cascade deletion of associated credentials
- Custom platforms only (default platforms protected)

---

## 9. Dashboard Credential Filters

**Video:** [dashboard_credential_filters.mp4](demo/dashboard_credential_filters.mp4)

https://github.com/user-attachments/assets/dashboard_credential_filters.mp4

**Description:**  
Dashboard filtering and sorting features:
- Search credentials by username, email, or platform name
- Real-time search with keyword filtering
- Sort by name, date created, last accessed
- Ascending/descending sort order
- Filter persistence across sessions

---

## 10. Dashboard Platform Filter

**Video:** [dashboard_platform_filter.mp4](demo/dashboard_platform_filter.mp4)

https://github.com/user-attachments/assets/dashboard_platform_filter.mp4

**Description:**  
Platform-based credential filtering:
- Filter credentials by specific platform
- Quick access to platform-specific credentials
- Combined with search and sort options
- Grouped credential display by platform

---

## 11. Platform Multi-Select Filter

**Video:** [dashboard_platform_filter.mp4](demo/dashboard_platform_filter.mp4)

https://github.com/user-attachments/assets/dashboard_platform_filter.mp4

**Description:**  
Advanced platform type filtering:
- Multi-select checkbox UI for platform types
- "All" option to select/deselect all types
- Filter by default types (Social, Gaming, Email, etc.)
- Filter by custom user-created types
- Compact FilterChip layout for easy selection
- Empty selection = show all platforms

---

## 12. Exporting Database

**Video:** [exporting_database.mp4](demo/exporting_database.mp4)

https://github.com/user-attachments/assets/exporting_database.mp4

**Description:**  
Encrypted vault backup creation:
- Passphrase verification before export
- Generate encrypted ZIP backup with vault.enc
- Include metadata.json with backup statistics
- Save to device Downloads folder
- Export confirmation with file location
- Keyboard-aware scrollable layout

---

## 13. Importing Database

**Video:** [importing_database.mp4](demo/importing_database.mp4)

https://github.com/user-attachments/assets/importing_database.mp4

**Description:**  
Vault restoration from backup:
- File picker for selecting backup ZIP
- Backup preview with credential count and date
- Passphrase verification for decryption
- PIN setup for restored vault
- Optional biometric enrollment
- Complete vault restoration and auto-unlock

---

## Technical Features Demonstrated

### Security
- ✅ PIN-based authentication with numeric keypad
- ✅ Biometric authentication (fingerprint/face)
- ✅ BIP-39 passphrase generation
- ✅ AES-256-GCM field encryption
- ✅ Secure credential viewing with PIN gate
- ✅ Auto-lock on screen off and background

### User Experience
- ✅ Material Design 3 with dark mode
- ✅ Keyboard-aware layouts with tap-to-dismiss
- ✅ Real-time search and filtering
- ✅ Password strength indicator
- ✅ Form validation with error messages
- ✅ Username sanitization (reject punctuation except @)
- ✅ Email validation with proper error display

### Data Management
- ✅ Multiple credential types support
- ✅ Platform organization with custom types
- ✅ Encrypted backup export/import
- ✅ 24-hour platform name edit restriction
- ✅ Cascade deletion with warnings
- ✅ Duplicate validation

---

## Repository

For more information, visit the [GitHub repository](https://github.com/motebaya/vault-app-mobile).

---

_All videos recorded on Android device running Vault App v1.0_
