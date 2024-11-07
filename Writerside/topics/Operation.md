# Operation

<warning>TODO: Overview article</warning>

## ISP Nexus Users

<!-- Refers to configuration.md for content -->
<include from="Configuration.md" element-id="configuration-user-article"/>

<include from="Configuration.md" element-id="configuration-user-manage"/>

<include from="Configuration.md" element-id="configuration-user-reset"/>

## Custom Menus

<p>
    Users can add links to external content through the ISP Nexus <control>Custom Menus</control> page,
    allowing you to keep all of your networking tools in one neatly organized place.
</p>

<procedure title="Adding a Custom Menu">
    <list>
        <li>Menus can be found under <control>Administration → Menus</control> on the ISP Nexus dashboard</li>
    </list>
    <img src="menus.png" alt="Custom menus" border-effect="line"/>
    <list>
        <li>Select <code>ADD DROPDOWN</code> to create a new menu</li>
    </list>
    <img src="menus-detailed-1.png" alt="Custom menu creation" border-effect="line"/>
    <list>
        <li>Fill out a name, numeric priority value for the service, and select the minimum
        access level required to see the menu. Finally, select <code>ADD</code>.
        The priority level is used to order your menus, a higher priority will appear at the top</li>
        <li>After creating a new menu, you now need to add links. Select <code>ADD LINK</code> to continue.</li>
    </list>
    <img src="menus-detailed-2.png" alt="Add link" border-effect="line"/>
    <img src="menus-detailed-3.png" alt="Add link page" border-effect="line"/>
    <list>
        <li>Again, provide a name for the specific link, and the address. Since
        each custom menu allows for multiple links, you will also need to assign it a priority level</li>
    </list>
    <img src="menus-detailed-4.png" alt="Add menu complete" border-effect="line"/>
    <list>
        <li>Your custom menu will now appear in the ISP Nexus Navbar for easy access</li>
        <li>Remove or edit your custom menus at any time through this page</li>
    </list>
</procedure>

## Error Logging

All services within ISP Nexus push their output logs, including warnings and errors,
to a centralized location in order to make troubleshooting quick and painless.

<procedure title="Accessing Logs" id="operation-logs">
    <list>
        <li>Logs can be found under <control>Administration → Logs</control> on the ISP Nexus dashboard</li>
    </list>
    <img src="logs.png" alt="Output logs" border-effect="line"/>
    <step>Clicking on the hyperlinked number next to <code>Log count</code>
    will take you to a detailed output page for that service:</step>
    <img src="logs-detailed.png" alt="Output log detailed view" border-effect="line"/>
    <list>
        <li>Functionality for saving and resetting logs is also included in the detail view</li>
    </list>
</procedure>