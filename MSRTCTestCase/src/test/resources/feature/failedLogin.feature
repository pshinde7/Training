Feature: annotation 
 
Scenario: 
   Given I am on MSRTC login page 
   When I enter username as "TOM"
   And I enter password as "JERRY" 
   And I enter captcha as "1235"
   Then Login should fail 
