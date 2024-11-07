# Configuration

Get the most out of ISP Nexus by taking advantage of its comprehensive
configuration options, allowing you to tailor it to your needs and preferences.

<warning>
    Many config options currently in ISP Nexus are there for testing some past feature, or don't work at all.
    These were never removed or hidden because Matt was the only one who was going to see any of it.
    Some cleanup of the ISP Nexus dashboard is required before a comprehensive config guide can be made.
</warning>

<tip>
    For the purposes of this guide, the "ISP Nexus Dashboard" refers to the home page of the service.
    This is hosted at your machine's <code>IPv4</code> address.
    The default port is <code>8080</code>, however this should be configured to something else as it could
    cause conflicts on your network. See <a href="Installation.md#installation-configure-port">port configuration here</a>.
    Example IP: <code>10.x.x.x:9100</code>
</tip>

## Debug Server

<p id="configuration-debug-article">ISP Nexus contains a Debug server and statistics page, which is disabled by default.</p>

<procedure title="Enabling Debug Server" id="configuration-debug-enable">
    <step>Navigate to the ISP Nexus dashboard</step>
    <step>Debug server settings are found under <control>Administration → Settings → ServiceWeb</control></step>
    <step>Configure <control>Debug</control> to <code>true</code>, and set a port under <control>Debug Port</control></step>
    <img src="debug-server-setup.png" alt="Debug server setup" border-effect="line"/>
</procedure>

<tip id="configuration-debug-restart">Note: you will need to restart the ISP Nexus service for this to take effect.</tip>

<procedure title="Accessing Debug Server" id="configuration-debug-access">
    <p>The debug server can now be accessed at the same IP as ISP Nexus using your newly configured port.</p>
    <img src="debug-server-view.png" alt="Debug server view" border-effect="line"/>
</procedure>

## Backup Procedures

ISP Nexus allows for both automatic and manual backups, depending on your personal preference.

<procedure title="Automatic Backups">
    <list>
        <li>ISP Nexus supports automatic backups using an Amazon S3 Bucket</li>
    </list>
    <step>Navigate to the ISP Nexus dashboard</step>
    <step>Access the Backup Service page under <control>Administration → Settings → Backup Service</control></step>
    <step>Fill in your S3 bucket information here</step>
    <step>Optionally, enable the <control>Encrypted Backups</control> toggle
    and enter an encryption passphrase to use encrypted backups</step>
</procedure>

<procedure title="Manual Backups">
    <list>
        <li>If automatic backups are not desired, manual backups can be done through the ISP Nexus dashboard</li>
    </list>
    <step>Navigate to the ISP Nexus dashboard</step>
    <step>Access the Database tab under <control>Administration → Database</control></step>
    <step>Use the <code>BACKUP NOW</code> button to create a new backup</step>
    <img src="backup-manual.png" alt="Manual backup" border-effect="line"/>
</procedure>

<procedure title="Restoring from a Backup">
    <step>Navigate to the Database tab in ISP Nexus from <control>Administration → Database</control></step>
    <step>Select an item to partially or fully restore from</step>
    <step>Additionally, you can download or delete previous backups</step>
    <img src="backup-restore.png" alt="Restoring from a backup" border-effect="line"/>
</procedure>

<tip>Backups can also be performed under <control>Administration → Settings → Service Manager</control></tip>

## Sonar Payment Authentication

<procedure title="Sonar DHCP Service">
    <list>
        <li>In order to integrate Sonar Software payment service for user authentication,
        you will need to add your Sonar API key to the DHCP</li>
        <li>Navigate to <control>Administration → Settings → Sonar DHCP Service</control>
        to configure your API key</li>
    </list>
    <img src="sonar-dhcp.png" alt="Sonar dhcp" border-effect="line"/>
</procedure>

<procedure title="Sonar Hook">
    <step>Add your server URL so that Sonar is able to verify authenticated users</step>
    <img src="sonar-hook.png" alt="Sonar hook" border-effect="line"/>
</procedure>

## Configuring Users

<p id="configuration-user-article">User management is made easy with the integrated tools on the ISP Nexus dashboard.
3 levels of users allow you to configure customer, technician, and admin access to your ISP Nexus service.</p>

<procedure title="User Management" id="configuration-user-manage">
    <list>
        <li>
            User management settings can be found under
            <control>Administration → User Settings</control> on the ISP Nexus dashboard
        </li>
        <li>Adding, viewing, editing, and removing users can all be done through this page</li>
        <li>Additionally, password changes for your own account are also done here</li>
        <li>Users are allowed to add new users at or below their own account's access level</li>
    </list>
    <img src="user-management.png" alt="User management" border-effect="line"/>
    <img src="user-management-detailed.png" alt="User list" border-effect="line"/>
</procedure>

<procedure title="Clearing ISP Nexus User Cookies" id="configuration-user-reset">
    <p>
        Resetting user cookies will force all users to log back in when they
        try using ISP Nexus, including your own account
    </p>
    <step>Pull up the ISP Nexus dashboard</step>
    <step>Navigate to <control>Administration → Settings → UserManager</control></step>
    <step>Run <control>Reset Secure Tokens</control> to clear encrypted cookies</step>
    <img src="user-reset-cookies.png" alt="Reset user cookies" border-effect="line"/>
</procedure>