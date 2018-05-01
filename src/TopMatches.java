import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Set;

/**
 * JFrame object that displays the search results to the user.
 *
 * @author dzungnguyen
 */
public class TopMatches extends javax.swing.JFrame {
    /**
     * Creates new form TopMatches
     */

    private List<JobPost> searchResults;

    public TopMatches(List<JobPost> searchResults) {
        this.searchResults = searchResults;
        initComponents();


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        findMoreJobs = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jobDropdown = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(50, 132, 207));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("careermatch");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Because tinder won't get you a job.");
        jLabel6.setToolTipText("");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-matches.png")))
        ; // NOI18N

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-home_filled" +
                ".png"))); // NOI18N
        jLabel3.setText("HOME");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-undo.png")));
        // NOI18N
        jLabel10.setText("SEARCH");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing
                                        .GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax
                                                        .swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle
                                                        .ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle
                                                        .ComponentPlacement.RELATED, javax.swing
                                                        .GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout
                                                        .DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)))
                                .addComponent(jLabel3)
                                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing
                                        .GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(jLabel5, javax.swing.GroupLayout
                                                        .PREFERRED_SIZE, 36, javax.swing
                                                        .GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle
                                                        .ComponentPlacement.RELATED)
                                                .addComponent(jLabel6))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel8)))
                                .addContainerGap(44, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                .createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing
                                        .GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel10))
                                .addGap(14, 14, 14))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        findMoreJobs.setText("More Jobs");
        findMoreJobs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                findMoreJobsMouseClicked(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(10);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(20);
        jTextArea1.setText("See more matches based on: ");
        jTextArea1.setEditable(false);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        String[] jobDropdownOptions = new String[searchResults.size() + 1];
        String[] companyDropdownOptions = new String[searchResults.size() + 1];
        jobDropdownOptions[0] = "None";
        companyDropdownOptions[0] = "None";
        for (int i = 1; i <= searchResults.size(); i++) {
            jobDropdownOptions[i] = searchResults.get(i - 1).getTitle();
            companyDropdownOptions[i] = searchResults.get(i - 1).getCompany();
        }


        jobDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(jobDropdownOptions));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(companyDropdownOptions));

        jLabel1.setText("Job Title:");

        jLabel2.setText("Company:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing
                                        .GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout
                                                .PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax
                                                        .swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout
                                                                .createSequentialGroup()
                                                                .addGap(24, 24, 24)
                                                                .addGroup(jPanel3Layout
                                                                        .createParallelGroup
                                                                                (javax.swing
                                                                                        .GroupLayout.Alignment.LEADING)
                                                                        .addComponent
                                                                                (jobDropdown,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent
                                                                                (findMoreJobs,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBox2,
                                                                                javax.swing
                                                                                        .GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel3Layout
                                                                .createSequentialGroup()
                                                                .addGap(40, 40, 40)
                                                                .addComponent(jLabel1))
                                                        .addGroup(jPanel3Layout
                                                                .createSequentialGroup()
                                                                .addGap(39, 39, 39)
                                                                .addComponent(jLabel2)))
                                                .addGap(0, 16, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout
                                        .PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement
                                        .UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement
                                        .UNRELATED)
                                .addComponent(jobDropdown, javax.swing.GroupLayout
                                        .PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing
                                                .GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(findMoreJobs)
                                .addContainerGap(129, Short.MAX_VALUE))
        );

        display.setEditable(false);
        display.setColumns(20);
        display.setRows(5);
        jScrollPane2.setViewportView(display);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing
                                .GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout
                                        .PREFERRED_SIZE, 731, javax.swing.GroupLayout
                                        .PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing
                                                .GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout
                                        .Alignment.LEADING)
                                        .addComponent(jPanel3, javax.swing.GroupLayout
                                                .DEFAULT_SIZE, javax.swing.GroupLayout
                                                .DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>


    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
        new Search().setVisible(true);
    }

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
        new HomePage().setVisible(true);
    }

    /**
     * Once the "more matches" button is clicked, the engine goes out and find
     * matches that corresponds to the job/company that the user has selected based on
     * method of triadic closure.
     *
     * @param evt
     */
    private void findMoreJobsMouseClicked(java.awt.event.MouseEvent evt) {
        setFocusable(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        String jobSelected = jobDropdown.getSelectedItem().toString();
        String company = jobDropdown.getSelectedItem().toString();
        if (jobSelected.equals("None") && company.equals("None")) {
            errorScreen("Please select at least one criteria.");
            return;
        }
        if (jobSelected.equals("None")) {
            jobSelected = "";
        }
        if (company.equals("None")) {
            company = "";
        }
        String keywords = jobSelected + " " + company;
        JobPost query = new JobPost(null, company, null, null, jobSelected,
                null, keywords, "world");
        APICall scraper = new APICall();
        Set<JobPost> setOfJobs = scraper.callAPI(keywords, "world",
                "date", "20");
        if (setOfJobs.isEmpty()) {
            errorScreen("No jobs found. Try again.");
            return;
        }
        List<JobPost> triadicClosureRecommendedList = TriadicClosure.recommendationList(query,
                setOfJobs);
        displayTriadicClosureRankings(triadicClosureRecommendedList);
    }

    /**
     * Creates a new error screen with the appropriate warning.
     *
     * @param message the warning displayed to user based on a certain behavior
     */
    private void errorScreen(String message) {
        SplashScreen error = new SplashScreen();
        error.jLabel1.setText(message);
        error.setLocationRelativeTo(this);
        error.pack();
        error.setVisible(true);
    }

    /**
     * Display the list of job posts found from triadic closure recommendation system.
     *
     * @param triadicClosureRecommendedList
     */
    private void displayTriadicClosureRankings(List<JobPost> triadicClosureRecommendedList) {
        int i = 0;
        JFrame displayRankings = new JFrame();
        JTextArea rankings = new JTextArea();
        rankings.setColumns(10);
        rankings.setRows(20);
        rankings.setLineWrap(true);
        StringBuilder results = new StringBuilder();
        for (JobPost job : triadicClosureRecommendedList) {
            String result = Integer.toString(i) + ". " + job.getTitle() + ": " + "\n" +
                    "Date Posted: " + triadicClosureRecommendedList.get(i).getDate() + "\n" +
                    "Location: " + triadicClosureRecommendedList.get(i).getLocations() + "\n" +
                    "Company: " + triadicClosureRecommendedList.get(i).getCompany() + "\n" +
                    "URL: " + triadicClosureRecommendedList.get(i).getJobLink() + "\n" + "\n";
            i++;
            results.append(result);
        }
        rankings.setText(results.toString());
        rankings.setEditable(false);
        JScrollPane scroll = new JScrollPane();
        scroll.setViewportView(rankings);
        displayRankings.add(scroll);
        displayRankings.setLocationRelativeTo(this);
        displayRankings.setSize(450, 650);
        displayRankings.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        displayRankings.setVisible(true);
        setCursor(Cursor.getDefaultCursor());
        setFocusable(true);
    }


    // Variables declaration - do not modify
    public javax.swing.JTextArea display;
    private javax.swing.JComboBox<String> jobDropdown;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton findMoreJobs;
    // End of variables declaration
}
