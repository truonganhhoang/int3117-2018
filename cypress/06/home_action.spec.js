context('Home page', () => {
  beforeEach(() => {
    cy.visit('https://hoclieu.sachmem.vn/folder/0')
  })

  it('check location', () => {
    expect(location.origin).to.eq('https://hoclieu.sachmem.vn')
    expect(location.port).to.eq('')
    expect(location.protocol).to.eq('https:')
  })

  it('click into page icon', async () => {
    await cy.get('.logo').click()
    await cy.url().should('eq', 'https://hoclieu.sachmem.vn/folder/0')
  })

  it('navbar new tab', () => {
    cy.get('a[href="http://gioithieu.sachmem.vn/"]').should('have.attr', 'target', '_blank')
    cy.get('a[href="https://www.sachmem.vn"]').should('have.attr', 'target', '_blank')
    cy.get('a[href="https://kiemtra.sachmem.vn/"]').should('have.attr', 'target', '_blank')
  })

  it('check login', async () => {
    await cy.get('#link-login').click()
    await cy.url().should('eq', "https://accounts.sachmem.vn/users/sign_in")
  })

  it('check dropdown languages', async () => {
    await cy.get('#languageDropdown').click()
    await cy.get('.dropdown-menu-right').should('have.class', 'show')
  })

  it('check dropdown about', async () => {
    await cy.get('#aboutDropdown').click()
    await cy.get('.dropdown-menu').should('have.class', 'show')
    await cy.get('.dropdown-item').should('have.attr', 'target', '_blank')
  })

  it('check list course', async () => {
    await cy.get('#languageDropdown').click()
    await cy.get('.dropdown-menu-right .show a').first().click()
    await cy.get('.list-group li').should(($lis) => {
      cy.get('#languageDropdown').click()
      expect($lis).to.have.length(11)
      expect($lis.eq(0)).to.contain('Khác')
      expect($lis.eq(1)).to.contain('Lớp 3')
      expect($lis.eq(1)).to.contain('Lớp 4')
      expect($lis.eq(1)).to.contain('Lớp 5')
      expect($lis.eq(1)).to.contain('Lớp 6')
      expect($lis.eq(1)).to.contain('Lớp 7')
      expect($lis.eq(1)).to.contain('Lớp 8')    
      expect($lis.eq(1)).to.contain('Lớp 9')
      expect($lis.eq(1)).to.contain('Lớp 10')
      expect($lis.eq(1)).to.contain('Lớp 11')
      expect($lis.eq(1)).to.contain('Lớp 12')
    })
  })

  it('cy.window() - get the global window object', () => {
    cy.window().should('have.property', 'top')
  })

  it('cy.document() - get the document object', () => {
    cy.document().should('have.property', 'charset').and('eq', 'UTF-8')
  })

  it('cy.title() - get the title', () => {
    cy.title().should('include', 'Học liệu - Sách Mềm')
  })
})