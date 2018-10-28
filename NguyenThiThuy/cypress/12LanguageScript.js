/// <reference types="Cypress" />
// Bug trong chuyển đổi ngôn ngữ
context('Language', () => {
  beforeEach(() => {
    cy.visit('https://hoclieu.sachmem.vn/folder/0')
  })

  describe('Implicit Assertions', () => {    
    it('click LanguageButton', () => {      
      cy.get('a[id = "languageDropdown"]').click()
      cy.get('.dropdown-menu > :nth-child(2)').contains('English').click()
      cy.contains('Tham gia làm bài tập')      
      cy.contains('Để sử dụng bạn cần')
      cy.contains('Log in')

      cy.get('a[id = "languageDropdown"]').click()
      cy.get('.dropdown-menu > :nth-child(1)').contains('Tiếng Việt').click()
      cy.contains('Tham gia làm bài tập')  
      // cy.contains('Log in')    
    })
  })  
})
