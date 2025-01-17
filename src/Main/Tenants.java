package Main;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import componentsUI.Header;
import componentsUI.RoundedButton;
import componentsUI.FrameDragUtility;
import componentsUI.RoundedPanel;
import componentsUI.SidebarPanel;
import componentsUI.BackgroundPanel;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.Cursor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tenants extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private BackgroundPanel photoPanel;
	private JTable tableTenants;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tenants frame = new Tenants();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tenants() {
		setTitle("Apartment Rentals and Facilities Billing System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1300, 800); // Fixed size
        setLocationRelativeTo(null); // Center the window
        setUndecorated(true); // Remove the border
        
        new FrameDragUtility(this);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(240, 238, 226));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        Header header = new Header(this);
        header.setBounds(0, 0, 1300, 26);
        getContentPane().add(header);
        
        SidebarPanel sidebar = new SidebarPanel(this, "Tenants");
        sidebar.setBounds(0, 129, 251, 671);
        getContentPane().add(sidebar);
        
        RoundedPanel mainPanel = new RoundedPanel(30);
        mainPanel.setBounds(301, 76, 949, 724);
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(null); // Absolute positioning
        contentPane.add(mainPanel);
        
        photoPanel = new BackgroundPanel("/images/interior1.png");
        photoPanel.setBackground(Color.RED);
        photoPanel.setBounds(251, 26, 1049, 774);
        photoPanel.setLayout(null); // Absolute positioning
        contentPane.add(photoPanel);
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                int frameHeight = getHeight(); // Get the new frame height
                int frameWidth = getWidth();
                photoPanel.setBounds(300, 26, frameWidth - 300, frameHeight - 26); // Adjust sidebarPanel height

            }
        });  
        
        JPanel stPanel = new JPanel();
        stPanel.setBackground(Color.LIGHT_GRAY);
        stPanel.setBounds(0, 61, 949, 663);
        mainPanel.add(stPanel);
        stPanel.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBackground(Color.WHITE);
        scrollPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  // for empty border
        scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 11));
        scrollPane.setBounds(0, 0, 949, 663);
        stPanel.add(scrollPane);
        
        tableTenants = new JTable();
        tableTenants.setSelectionBackground(new Color(255, 230, 150));
        
        tableTenants.setRowHeight(30);
        tableTenants.setShowVerticalLines(false);
        tableTenants.setShowHorizontalLines(false);
        tableTenants.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        tableTenants.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        	},
        	new String[] {
        		"Tenant ID", "Tenant Name", "Unit Rented", ""
        	}
        ));
        scrollPane.setViewportView(tableTenants);
        
        tableTenants.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (!isSelected) {
                    c.setBackground(row % 2 == 0 ? Color.WHITE : new Color(240, 238, 226) );
                }
                setHorizontalAlignment(SwingConstants.CENTER); // Center align text
                return c;
            }
        });
        
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                int frameHeight = getHeight(); // Get the new frame height
                int frameWidth = getWidth();
                stPanel.setBounds(0, 76, frameWidth - 401, frameHeight - 76);
                scrollPane.setBounds(0, 0, frameWidth - 401, frameHeight - 76); 
                tableTenants.setBounds(0, 0, frameWidth - 401, frameHeight - 76); 

            }
        });  
        

        // Table Header Style
        JTableHeader tblHeader = tableTenants.getTableHeader();
        tblHeader.setFont(new Font("Segoe UI", Font.BOLD, 20));
        tblHeader.setBackground(new Color(247, 247, 231));
        tblHeader.setForeground(Color.black);
        tblHeader.setReorderingAllowed(false);         
        
        JLabel lblTenants = new JLabel("Tenants");
        lblTenants.setFont(new Font("Segoe UI", Font.BOLD, 28));
        lblTenants.setBounds(15, 11, 265, 35);
        mainPanel.add(lblTenants);
        
      //  JButton btnAddTenant = new JButton("Add Tenant");
        RoundedButton btnAddTenant = new RoundedButton("Add Tenant", 15);
        btnAddTenant.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AddTenantDialog addTenantDialog = new AddTenantDialog();
                
                // Set modal to block other windows while this dialog is open
                addTenantDialog.setModal(true);
                
                // Display the dialog
                addTenantDialog.setVisible(true);
        	}
        });
        btnAddTenant.setForeground(Color.WHITE);
        btnAddTenant.setBorderPainted(false);
        btnAddTenant.setFont(new Font("Segoe UI", Font.BOLD, 12));
        btnAddTenant.setBackground(new Color(183, 183, 47));
        btnAddTenant.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnAddTenant.setBounds(726, 15, 100, 30);
        mainPanel.add(btnAddTenant);
        
     //   JButton btnRefresh = new JButton("Refresh");
        RoundedButton btnRefresh = new RoundedButton("Refresh", 15);
        btnRefresh.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        btnRefresh.setForeground(Color.WHITE);
        btnRefresh.setBorderPainted(false);
        btnRefresh.setFont(new Font("Segoe UI", Font.BOLD, 12));
        btnRefresh.setBackground(new Color(183, 183, 47));
        btnRefresh.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRefresh.setBounds(840, 15, 80, 30);
        mainPanel.add(btnRefresh);
        
        mainPanel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                int frameWidth = mainPanel.getWidth();
                btnAddTenant.setBounds(frameWidth - 215, 20, 100, 40); // Adjust sidebarPanel height
                btnRefresh.setBounds(frameWidth - 100, 20, 80, 40); // Adjust sidebarPanel height


            }
        });  
        
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                int frameHeight = getHeight(); // Get the new frame height
                int frameWidth = getWidth();
                mainPanel.setBounds(351, 76, frameWidth - 401, frameHeight - 76); // Adjust sidebarPanel height

            }
        });  
        
    /*    this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                int frameHeight = getHeight(); // Get the new frame height
                int frameWidth = getWidth();
                mainPanel.setBounds(401, 126, frameWidth - 451, frameHeight - 123); // Adjust sidebarPanel height

            }
        });  */
	}
}
