# Administration

Some placeholder

## Web Server Settings

For configuring the ISP Nexus web server.

### Firewalling

ISP Nexus incorporates firewalling into the software. This allows forward-facing networks to
allow/block IP ranges from accessing different ISP Nexus services.

<img src="customer-list.png" alt="Web server firewall" border-effect="line" width="706"/>

### Auto-Blacklist

<p>
    If someone is trying to access ISP Nexus routes that don't exist (for example, someone attempting to do
    something malicious), they will be shown in this <emphasis>Black List</emphasis> tab.
    They will be automatically blacklisted from the service after 10 attempts. If you accidentally
    blacklist yourself, restart ISP Nexus and you will regain access.
</p>

<img src="customer-list.png" alt="Web server blacklist" border-effect="line" width="706"/>

### Custom Menus

<p>
    Users can add links to external content through the ISP Nexus <control>Custom Menus</control> page,
    allowing you to keep all of your network monitoring tools in one place.
</p>

<procedure title="Adding a Custom Menu">
    <list>
        <li>Menus can be found under <control>Administration → Menus</control> on the ISP Nexus dashboard</li>
    </list>
    <img src="customer-list.png" alt="Custom menus" border-effect="line"/>
    <list>
        <li>Select <code>ADD DROPDOWN</code> to create a new menu</li>
    </list>
    <img src="customer-list.png" alt="Custom menu creation" border-effect="line"/>
    <list>
        <li>Fill out a name, numeric priority value for the service, and select the minimum
        access level required to see the menu. Finally, select <code>ADD</code>.
        The priority level is used to order your menus, a higher priority will appear at the top</li>
        <li>After creating a new menu, you now need to add links. Select <code>ADD LINK</code> to continue.</li>
    </list>
    <img src="customer-list.png" alt="Add link" border-effect="line"/>
    <img src="customer-list.png" alt="Add link page" border-effect="line"/>
    <list>
        <li>Again, provide a name for the specific link, and the address. Since
        each custom menu allows for multiple links, you will also need to assign it a priority level</li>
    </list>
    <img src="customer-list.png" alt="Add menu complete" border-effect="line"/>
    <list>
        <li>Your custom menu will now appear in the ISP Nexus Navbar for easy access</li>
        <li>Remove or edit your custom menus at any time through this page</li>
    </list>
</procedure>

### Error Logging

All services within ISP Nexus push their output logs, including warnings and errors,
to a centralized location in order to make troubleshooting quick and painless.

<procedure title="Accessing Logs" id="operation-logs">
    <list>
        <li>Logs can be found under <control>Administration → Logs</control> on the ISP Nexus dashboard</li>
    </list>
    <img src="customer-list.png" alt="Output logs" border-effect="line"/>
    <step>Clicking on the hyperlinked number next to <code>Log count</code>
    will take you to a detailed output page for that service:</step>
    <img src="customer-list.png" alt="Output log detailed view" border-effect="line"/>
    <list>
        <li>Functionality for saving and resetting logs is also included in the detail view</li>
    </list>
</procedure>